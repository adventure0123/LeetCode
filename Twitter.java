import java.util.*;

/**
 * Created by adventure on 16/6/19.
 */
public class Twitter {

    Map<Integer,List<tweet>> tweetMap;
    //存储每个用户发送的tweet
    Map<Integer,List<Integer>> followMap;
    //用户关注列表
    /** Initialize your data structure here. */
    public Twitter() {
        tweetMap=new HashMap<>();
        followMap=new HashMap<>();
    }

    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        //System.out.println(tweetId+"  "+new Date().getTime());
        if(tweetMap.containsKey(userId)){
            tweetMap.get(userId).add(0,new tweet(tweetId,System.nanoTime()));
        }else {
            List<tweet> list=new LinkedList<>();
            list.add(new tweet(tweetId,System.nanoTime() ));
            tweetMap.put(userId,list);
        }
    }

    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        List<tweet> mytweets=tweetMap.get(userId);
        List<tweet> result=new LinkedList<>();
        if(mytweets!=null){
            result.addAll(mytweets.size()>10?mytweets.subList(0,10):mytweets);
        }
        List<Integer> followees=followMap.get(userId);
        if(followees!=null){
            for(Integer followee:followees){
                if(tweetMap.get(followee)!=null){
                    List<tweet> followeeTweets=tweetMap.get(followee);
                    result.addAll(followeeTweets.size()>10?followeeTweets.subList(0,10):followeeTweets);
                }
            }
        }
        Collections.sort(result, new Comparator<tweet>() {
            @Override
            public int compare(tweet o1, tweet o2) {
                if(o1.getPsotTime()>o2.getPsotTime()){
                    return -1;
                }else if(o1.getPsotTime()<o2.getPsotTime()) {
                    return 1;
                }else {
                    return 0;
                }
            }
        });

        List<Integer> list=new LinkedList<>();
        if(result==null){
            return  list;
        }
        //System.out.println(result.get(0).getTweetId());
        List<tweet> subResult=result.size()>10?result.subList(0,10):result;
        for(tweet t:subResult){
            //System.out.println(t.getTweetId());
            list.add(t.tweetId);
        }
        return  list;
    }

    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        if(followeeId==followerId){
            return;
        }
        if(followMap.containsKey(followerId)){
            List<Integer> followees=followMap.get(followerId);
            if(followees.contains(followeeId)){
                return;
            }
            followMap.get(followerId).add(0,followeeId);
        }else {
            List<Integer> list=new LinkedList<>();
            list.add(followeeId);
            followMap.put(followerId,list);
        }
    }

    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        List<Integer> list=followMap.get(followerId);
        if(list==null){
            return;
        }
        for(Integer id:list){
            if(followeeId==id){
                list.remove(id);
                return;
            }
        }
    }

    class tweet{
        int tweetId;
        long psotTime;

        public tweet(int tweetId, long psotTime) {
            this.tweetId = tweetId;
            this.psotTime = psotTime;
        }

        public int getTweetId() {
            return tweetId;
        }

        public void setTweetId(int tweetId) {
            this.tweetId = tweetId;
        }

        public long getPsotTime() {
            return psotTime;
        }

        public void setPsotTime(long psotTime) {
            this.psotTime = psotTime;
        }


    }

    public static void main(String[] args) {
        Twitter twitter = new Twitter();

// User 1 posts a new tweet (id = 5).
//        twitter.postTweet(1, 4);
//        twitter.postTweet(1, 5);
        for(int i=0;i<20;i++){
            if(i%2==0){
                twitter.postTweet(1,i);
            }else{
                twitter.postTweet(2,200+i);
            }
        }
// User 1's news feed should return a list with 1 tweet id -> [5].
        System.out.println(twitter.getNewsFeed(1));

// User 1 follows user 2.
        twitter.follow(1, 2);


// User 2 posts a new tweet (id = 6).
//        twitter.postTweet(2, 6);

// User 1's news feed should return a list with 2 tweet ids -> [6, 5].
// Tweet id 6 should precede tweet id 5 because it is posted after tweet id 5.
        List<Integer> list=twitter.getNewsFeed(1);
        System.out.println(list);

//// User 1 unfollows user 2.
//        twitter.unfollow(1, 2);
//
//// User 1's news feed should return a list with 1 tweet id -> [5],
//// since user 1 is no longer following user 2.
//        List<Integer> result=twitter.getNewsFeed(1);
//        System.out.println(result);
    }
}
