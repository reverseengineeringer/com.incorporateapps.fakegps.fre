package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult;
import java.util.ArrayList;

class zzbb$2
  extends zzi
{
  zzbb$2(zzbb paramzzbb, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    paramzzbp.zzt(this);
  }
  
  protected NodeApi.GetConnectedNodesResult zzbB(Status paramStatus)
  {
    return new zzbb.zza(paramStatus, new ArrayList());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzbb.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */