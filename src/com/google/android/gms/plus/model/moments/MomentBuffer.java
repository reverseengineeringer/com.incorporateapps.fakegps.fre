package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.internal.model.moments.zzc;

public final class MomentBuffer
  extends AbstractDataBuffer
{
  public MomentBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public final Moment get(int paramInt)
  {
    return new zzc(zzahi, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.model.moments.MomentBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */