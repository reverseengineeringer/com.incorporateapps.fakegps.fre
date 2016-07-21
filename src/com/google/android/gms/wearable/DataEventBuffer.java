package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;
import com.google.android.gms.wearable.internal.zzz;

public class DataEventBuffer
  extends zzf
  implements Result
{
  private final Status zzUX;
  
  public DataEventBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    zzUX = new Status(paramDataHolder.getStatusCode());
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
  
  protected String zzqg()
  {
    return "path";
  }
  
  protected DataEvent zzw(int paramInt1, int paramInt2)
  {
    return new zzz(zzahi, paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.DataEventBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */