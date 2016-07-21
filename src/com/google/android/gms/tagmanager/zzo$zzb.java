package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class zzo$zzb
  extends Handler
{
  private final ContainerHolder.ContainerAvailableListener zzbhZ;
  
  public zzo$zzb(zzo paramzzo, ContainerHolder.ContainerAvailableListener paramContainerAvailableListener, Looper paramLooper)
  {
    super(paramLooper);
    zzbhZ = paramContainerAvailableListener;
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (what)
    {
    default: 
      zzbg.e("Don't know how to handle this message.");
      return;
    }
    zzfV((String)obj);
  }
  
  public void zzfU(String paramString)
  {
    sendMessage(obtainMessage(1, paramString));
  }
  
  protected void zzfV(String paramString)
  {
    zzbhZ.onContainerAvailable(zzbia, paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzo.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */