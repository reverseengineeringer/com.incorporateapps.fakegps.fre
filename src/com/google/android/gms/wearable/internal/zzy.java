package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

public class zzy
  implements DataEvent
{
  private int zzabB;
  private DataItem zzbsv;
  
  public zzy(DataEvent paramDataEvent)
  {
    zzabB = paramDataEvent.getType();
    zzbsv = ((DataItem)paramDataEvent.getDataItem().freeze());
  }
  
  public DataItem getDataItem()
  {
    return zzbsv;
  }
  
  public int getType()
  {
    return zzabB;
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    String str;
    if (getType() == 1) {
      str = "changed";
    }
    for (;;)
    {
      return "DataEventEntity{ type=" + str + ", dataitem=" + getDataItem() + " }";
      if (getType() == 2) {
        str = "deleted";
      } else {
        str = "unknown";
      }
    }
  }
  
  public DataEvent zzIK()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */