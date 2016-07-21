package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.zzb;

public class AmsEntityUpdateParcelable
  implements SafeParcelable, zzb
{
  public static final Parcelable.Creator CREATOR = new zzf();
  private final String mValue;
  final int mVersionCode;
  private byte zzbrF;
  private final byte zzbrG;
  
  AmsEntityUpdateParcelable(int paramInt, byte paramByte1, byte paramByte2, String paramString)
  {
    zzbrF = paramByte1;
    mVersionCode = paramInt;
    zzbrG = paramByte2;
    mValue = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      paramObject = (AmsEntityUpdateParcelable)paramObject;
      if (zzbrF != zzbrF) {
        return false;
      }
      if (mVersionCode != mVersionCode) {
        return false;
      }
      if (zzbrG != zzbrG) {
        return false;
      }
    } while (mValue.equals(mValue));
    return false;
  }
  
  public String getValue()
  {
    return mValue;
  }
  
  public int hashCode()
  {
    return ((mVersionCode * 31 + zzbrF) * 31 + zzbrG) * 31 + mValue.hashCode();
  }
  
  public String toString()
  {
    return "AmsEntityUpdateParcelable{mVersionCode=" + mVersionCode + ", mEntityId=" + zzbrF + ", mAttributeId=" + zzbrG + ", mValue='" + mValue + '\'' + '}';
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  public byte zzIA()
  {
    return zzbrG;
  }
  
  public byte zzIz()
  {
    return zzbrF;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */