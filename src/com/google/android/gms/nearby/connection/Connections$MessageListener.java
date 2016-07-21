package com.google.android.gms.nearby.connection;

public abstract interface Connections$MessageListener
{
  public abstract void onDisconnected(String paramString);
  
  public abstract void onMessageReceived(String paramString, byte[] paramArrayOfByte, boolean paramBoolean);
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.connection.Connections.MessageListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */