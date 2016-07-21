package com.google.android.gms.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Response;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

public abstract class zzkh
  extends zzkg.zza
{
  protected zza.zzb zzUz;
  
  public zzkh(zza.zzb paramzzb)
  {
    zzUz = paramzzb;
  }
  
  public void zza(GetRecentContextCall.Response paramResponse) {}
  
  public void zza(Status paramStatus) {}
  
  public void zza(Status paramStatus, ParcelFileDescriptor paramParcelFileDescriptor) {}
  
  public void zza(Status paramStatus, boolean paramBoolean) {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzkh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */