package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.zzd;

public class AncsNotificationParcelable
  implements SafeParcelable, zzd
{
  public static final Parcelable.Creator CREATOR = new zzh();
  private int mId;
  final int mVersionCode;
  private String zzTJ;
  private String zzWQ;
  private final String zzaDH;
  private final String zzaUa;
  private final String zzaaH;
  private final String zzapg;
  private final String zzbrH;
  private byte zzbrI;
  private byte zzbrJ;
  private byte zzbrK;
  private byte zzbrL;
  
  AncsNotificationParcelable(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, String paramString7)
  {
    mId = paramInt2;
    mVersionCode = paramInt1;
    zzaUa = paramString1;
    zzbrH = paramString2;
    zzaaH = paramString3;
    zzapg = paramString4;
    zzaDH = paramString5;
    zzWQ = paramString6;
    zzbrI = paramByte1;
    zzbrJ = paramByte2;
    zzbrK = paramByte3;
    zzbrL = paramByte4;
    zzTJ = paramString7;
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
      paramObject = (AncsNotificationParcelable)paramObject;
      if (zzbrL != zzbrL) {
        return false;
      }
      if (zzbrK != zzbrK) {
        return false;
      }
      if (zzbrJ != zzbrJ) {
        return false;
      }
      if (zzbrI != zzbrI) {
        return false;
      }
      if (mId != mId) {
        return false;
      }
      if (mVersionCode != mVersionCode) {
        return false;
      }
      if (!zzaUa.equals(zzaUa)) {
        return false;
      }
      if (zzbrH != null)
      {
        if (zzbrH.equals(zzbrH)) {}
      }
      else {
        while (zzbrH != null) {
          return false;
        }
      }
      if (!zzWQ.equals(zzWQ)) {
        return false;
      }
      if (!zzaaH.equals(zzaaH)) {
        return false;
      }
      if (!zzaDH.equals(zzaDH)) {
        return false;
      }
    } while (zzapg.equals(zzapg));
    return false;
  }
  
  public String getDisplayName()
  {
    if (zzWQ == null) {
      return zzaUa;
    }
    return zzWQ;
  }
  
  public int getId()
  {
    return mId;
  }
  
  public String getPackageName()
  {
    return zzTJ;
  }
  
  public String getTitle()
  {
    return zzapg;
  }
  
  public int hashCode()
  {
    int j = mVersionCode;
    int k = mId;
    int m = zzaUa.hashCode();
    if (zzbrH != null) {}
    for (int i = zzbrH.hashCode();; i = 0) {
      return ((((((((i + ((j * 31 + k) * 31 + m) * 31) * 31 + zzaaH.hashCode()) * 31 + zzapg.hashCode()) * 31 + zzaDH.hashCode()) * 31 + zzWQ.hashCode()) * 31 + zzbrI) * 31 + zzbrJ) * 31 + zzbrK) * 31 + zzbrL;
    }
  }
  
  public String toString()
  {
    return "AncsNotificationParcelable{mVersionCode=" + mVersionCode + ", mId=" + mId + ", mAppId='" + zzaUa + '\'' + ", mDateTime='" + zzbrH + '\'' + ", mNotificationText='" + zzaaH + '\'' + ", mTitle='" + zzapg + '\'' + ", mSubtitle='" + zzaDH + '\'' + ", mDisplayName='" + zzWQ + '\'' + ", mEventId=" + zzbrI + ", mEventFlags=" + zzbrJ + ", mCategoryId=" + zzbrK + ", mCategoryCount=" + zzbrL + '}';
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
  
  public String zzIB()
  {
    return zzbrH;
  }
  
  public String zzIC()
  {
    return zzaaH;
  }
  
  public byte zzID()
  {
    return zzbrI;
  }
  
  public byte zzIE()
  {
    return zzbrJ;
  }
  
  public byte zzIF()
  {
    return zzbrK;
  }
  
  public byte zzIG()
  {
    return zzbrL;
  }
  
  public String zzwK()
  {
    return zzaUa;
  }
  
  public String zzwc()
  {
    return zzaDH;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.AncsNotificationParcelable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */