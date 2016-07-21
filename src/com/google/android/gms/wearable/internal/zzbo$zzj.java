package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import java.util.ArrayList;
import java.util.List;

final class zzbo$zzj
  extends zzbo.zzb
{
  public zzbo$zzj(zza.zzb paramzzb)
  {
    super(paramzzb);
  }
  
  public final void zza(GetConnectedNodesResponse paramGetConnectedNodesResponse)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(zzbsI);
    zzX(new zzbb.zza(zzbk.zzgc(statusCode), localArrayList));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzbo.zzj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */