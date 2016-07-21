package com.google.android.gms.wearable;

import com.google.android.gms.common.data.DataHolder;

class WearableListenerService$zza$1
  implements Runnable
{
  WearableListenerService$zza$1(WearableListenerService.zza paramzza, DataHolder paramDataHolder) {}
  
  public void run()
  {
    DataEventBuffer localDataEventBuffer = new DataEventBuffer(zzbrr);
    try
    {
      zzbrs.zzbrq.onDataChanged(localDataEventBuffer);
      return;
    }
    finally
    {
      localDataEventBuffer.release();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.WearableListenerService.zza.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */