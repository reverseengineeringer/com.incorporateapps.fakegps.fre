package com.google.android.gms.drive.realtime.internal;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;

public abstract interface zzo
  extends IInterface
{
  public abstract void onError(Status paramStatus);
  
  public abstract void onSuccess();
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.zzo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */