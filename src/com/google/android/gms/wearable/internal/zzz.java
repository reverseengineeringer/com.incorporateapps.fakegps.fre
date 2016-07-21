package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

public final class zzz
  extends zzc
  implements DataEvent
{
  private final int zzaDQ;
  
  public zzz(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    zzaDQ = paramInt2;
  }
  
  public final DataItem getDataItem()
  {
    return new zzaf(zzahi, zzaje, zzaDQ);
  }
  
  public final int getType()
  {
    return getInteger("event_type");
  }
  
  public final String toString()
  {
    String str;
    if (getType() == 1) {
      str = "changed";
    }
    for (;;)
    {
      return "DataEventRef{ type=" + str + ", dataitem=" + getDataItem() + " }";
      if (getType() == 2) {
        str = "deleted";
      } else {
        str = "unknown";
      }
    }
  }
  
  public final DataEvent zzIK()
  {
    return new zzy(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */