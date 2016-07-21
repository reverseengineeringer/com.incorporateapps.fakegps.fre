package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class zzd
  extends AbstractDataBuffer
{
  private static final String[] zzajg = { "data" };
  private final Parcelable.Creator zzajh;
  
  public zzd(DataHolder paramDataHolder, Parcelable.Creator paramCreator)
  {
    super(paramDataHolder);
    zzajh = paramCreator;
  }
  
  public SafeParcelable zzbG(int paramInt)
  {
    Object localObject = zzahi.zzg("data", paramInt, zzahi.zzbH(paramInt));
    Parcel localParcel = Parcel.obtain();
    localParcel.unmarshall((byte[])localObject, 0, localObject.length);
    localParcel.setDataPosition(0);
    localObject = (SafeParcelable)zzajh.createFromParcel(localParcel);
    localParcel.recycle();
    return (SafeParcelable)localObject;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.data.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */