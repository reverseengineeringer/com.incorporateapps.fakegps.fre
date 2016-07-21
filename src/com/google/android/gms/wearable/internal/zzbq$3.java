package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.DataEventBuffer;

final class zzbq$3
  implements zzq.zzb
{
  zzbq$3(DataHolder paramDataHolder) {}
  
  public final void zza(DataApi.DataListener paramDataListener)
  {
    try
    {
      paramDataListener.onDataChanged(new DataEventBuffer(zzbrr));
      return;
    }
    finally
    {
      zzbrr.close();
    }
  }
  
  public final void zzpr()
  {
    zzbrr.close();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzbq.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */