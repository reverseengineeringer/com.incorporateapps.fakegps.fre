package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Operator
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzn();
  public static final Operator zzauA = new Operator(">");
  public static final Operator zzauB = new Operator(">=");
  public static final Operator zzauC = new Operator("and");
  public static final Operator zzauD = new Operator("or");
  public static final Operator zzauE = new Operator("not");
  public static final Operator zzauF = new Operator("contains");
  public static final Operator zzaux = new Operator("=");
  public static final Operator zzauy = new Operator("<");
  public static final Operator zzauz = new Operator("<=");
  final String mTag;
  final int mVersionCode;
  
  Operator(int paramInt, String paramString)
  {
    mVersionCode = paramInt;
    mTag = paramString;
  }
  
  private Operator(String paramString)
  {
    this(1, paramString);
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
      do
      {
        return true;
        if (paramObject == null) {
          return false;
        }
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        paramObject = (Operator)paramObject;
        if (mTag != null) {
          break;
        }
      } while (mTag == null);
      return false;
    } while (mTag.equals(mTag));
    return false;
  }
  
  public String getTag()
  {
    return mTag;
  }
  
  public int hashCode()
  {
    if (mTag == null) {}
    for (int i = 0;; i = mTag.hashCode()) {
      return i + 31;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzn.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.query.internal.Operator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */