package com.hyperfresh.mchyperchat;

public interface User
{
	/**
	 * Gets the name of this user.
	 *
	 * @return the name of the user.
	 */
	public String getName();

	/**
	 * Gets the last message that this user has sent.
	 *
	 * @return the last message this user has sent
	 */
	public String getLastMessage();

	/**
	 * Sets the last message that this user has sent.
	 * <p/>
	 * In most cases, the {@code HyperChatEventPoster} class should be the only
	 * class to use this method.
	 *
	 * @param said the last message this user has sent
	 * @see com.hyperfresh.mchyperchat.HyperChatEventPoster
	 */
	public void setLastMessage(String said);

	/**
	 * Sends a message to the User.
	 *
	 * @param message the message to send
	 */
	public void sendMessage(String message);
}
