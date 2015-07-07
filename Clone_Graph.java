package com.LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Clone_Graph {
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		Map<Integer, UndirectedGraphNode> map = new HashMap<>();
		Set<Integer> hasClone = new HashSet<>();
		Queue<UndirectedGraphNode> queue = new LinkedList<>();
		if (node == null) {
			return null;
		}
		queue.add(node);
		// hasClone.add(node.label);
		// map.put(node.label, node);
		boolean root = true;
		UndirectedGraphNode resultGraphNode = null;
		while (!queue.isEmpty()) {
			UndirectedGraphNode temp = queue.poll();
			UndirectedGraphNode p = null;
			if (map.containsKey(temp.label)) {
				p = map.get(temp.label);
			} else {
				p = new UndirectedGraphNode(temp.label);
				map.put(p.label, p);
			}
			if (root) {
				resultGraphNode = p;
				root = false;
			}
			int length = temp.neighbors.size();
			hasClone.add(temp.label);
			for (int i = 0; i < length; i++) {
				UndirectedGraphNode neighbor = temp.neighbors.get(i);
				if (!map.containsKey(neighbor.label)) {
					UndirectedGraphNode clone = new UndirectedGraphNode(
							neighbor.label);
					map.put(neighbor.label, clone);
					if (!hasClone.contains(neighbor.label)) {
						queue.add(neighbor);
					}
				}
				p.neighbors.add(map.get(neighbor.label));
			}

		}
		return resultGraphNode;

	}
}
