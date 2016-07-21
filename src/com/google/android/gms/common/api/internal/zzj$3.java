package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import java.util.concurrent.atomic.AtomicReference;

class zzj$3
  implements GoogleApiClient.ConnectionCallbacks
{
  zzj$3(zzj paramzzj, AtomicReference paramAtomicReference, zzv paramzzv) {}
  
  public void onConnected(Bundle paramBundle)
  {
    zzj.zza(zzaid, (GoogleApiClient)zzaie.get(), zzaif, true);
  }
  
  public void onConnectionSuspended(int paramInt) {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzj.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */