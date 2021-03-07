package com.yechangqing.raft4j;

/**
 * 结点状态
 */
public enum NodeState {
	/**
	 * 领导者
	 */
	LEADER,
	/**
	 * 追随者
	 */
	FOLLOWER,
	/**
	 * 候选人
	 */
	CANDIDATE
}
