package com.google.android.gms.drive.realtime.internal;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;

public abstract interface zzg
  extends IInterface
{
  public abstract void onError(Status paramStatus);
  
  public abstract void zza(DataHolder paramDataHolder, ParcelableEventList paramParcelableEventList);
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */