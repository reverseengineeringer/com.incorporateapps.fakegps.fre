package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.request.DataInsertRequest;

class zzpc$1
  extends zzob.zzc
{
  zzpc$1(zzpc paramzzpc, GoogleApiClient paramGoogleApiClient, DataSet paramDataSet, boolean paramBoolean)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzob paramzzob)
  {
    zzph localzzph = new zzph(this);
    ((zzom)paramzzob.zzqJ()).zza(new DataInsertRequest(zzazU, localzzph, zzazV));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpc.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */