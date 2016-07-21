package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.metadata.CustomPropertyKey;

public class CustomProperty
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzc();
  final String mValue;
  final int mVersionCode;
  final CustomPropertyKey zzasN;
  
  CustomProperty(int paramInt, CustomPropertyKey paramCustomPropertyKey, String paramString)
  {
    mVersionCode = paramInt;
    zzx.zzb(paramCustomPropertyKey, "key");
    zzasN = paramCustomPropertyKey;
    mValue = paramString;
  }
  
  public CustomProperty(CustomPropertyKey paramCustomPropertyKey, String paramString)
  {
    this(1, paramCustomPropertyKey, paramString);
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
      if ((paramObject == null) || (paramObject.getClass() != getClass())) {
        return false;
      }
      paramObject = (CustomProperty)paramObject;
    } while ((zzw.equal(zzasN, zzasN)) && (zzw.equal(mValue, mValue)));
    return false;
  }
  
  public String getValue()
  {
    return mValue;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzasN, mValue });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public CustomPropertyKey zztB()
  {
    return zzasN;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.CustomProperty
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */