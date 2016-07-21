package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Response;
import com.google.android.gms.common.api.Status;

public abstract interface zzkg
  extends IInterface
{
  public abstract void zza(GetRecentContextCall.Response paramResponse);
  
  public abstract void zza(Status paramStatus);
  
  public abstract void zza(Status paramStatus, ParcelFileDescriptor paramParcelFileDescriptor);
  
  public abstract void zza(Status paramStatus, boolean paramBoolean);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzkg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */