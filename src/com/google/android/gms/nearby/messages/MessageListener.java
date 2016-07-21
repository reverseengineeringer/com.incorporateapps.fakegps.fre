package com.google.android.gms.nearby.messages;

public abstract class MessageListener
{
  public abstract void onFound(Message paramMessage);
  
  public void onLost(Message paramMessage) {}
  
  public void zza(Message paramMessage) {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.MessageListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */