package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;

public final class zzc
  extends com.google.android.gms.common.data.zzc
  implements Moment
{
  private MomentEntity zzbfK;
  
  public zzc(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  private MomentEntity zzFo()
  {
    try
    {
      if (zzbfK == null)
      {
        byte[] arrayOfByte = getByteArray("momentImpl");
        Parcel localParcel = Parcel.obtain();
        localParcel.unmarshall(arrayOfByte, 0, arrayOfByte.length);
        localParcel.setDataPosition(0);
        zzbfK = MomentEntity.CREATOR.zzgD(localParcel);
        localParcel.recycle();
      }
      return zzbfK;
    }
    finally {}
  }
  
  public final String getId()
  {
    return zzFo().getId();
  }
  
  public final ItemScope getResult()
  {
    return zzFo().getResult();
  }
  
  public final String getStartDate()
  {
    return zzFo().getStartDate();
  }
  
  public final ItemScope getTarget()
  {
    return zzFo().getTarget();
  }
  
  public final String getType()
  {
    return zzFo().getType();
  }
  
  public final boolean hasId()
  {
    return zzFo().hasId();
  }
  
  public final boolean hasResult()
  {
    return zzFo().hasResult();
  }
  
  public final boolean hasStartDate()
  {
    return zzFo().hasStartDate();
  }
  
  public final boolean hasTarget()
  {
    return zzFo().hasTarget();
  }
  
  public final boolean hasType()
  {
    return zzFo().hasType();
  }
  
  public final MomentEntity zzFn()
  {
    return zzFo();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.model.moments.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */