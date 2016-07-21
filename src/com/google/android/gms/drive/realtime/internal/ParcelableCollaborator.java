package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ParcelableCollaborator
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzq();
  final int mVersionCode;
  final String zzLq;
  final String zzWQ;
  final boolean zzaeW;
  final boolean zzauI;
  final String zzauJ;
  final String zzauK;
  final String zzrG;
  
  ParcelableCollaborator(int paramInt, boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    mVersionCode = paramInt;
    zzauI = paramBoolean1;
    zzaeW = paramBoolean2;
    zzLq = paramString1;
    zzrG = paramString2;
    zzWQ = paramString3;
    zzauJ = paramString4;
    zzauK = paramString5;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof ParcelableCollaborator)) {
      return false;
    }
    paramObject = (ParcelableCollaborator)paramObject;
    return zzLq.equals(zzLq);
  }
  
  public int hashCode()
  {
    return zzLq.hashCode();
  }
  
  public String toString()
  {
    return "Collaborator [isMe=" + zzauI + ", isAnonymous=" + zzaeW + ", sessionId=" + zzLq + ", userId=" + zzrG + ", displayName=" + zzWQ + ", color=" + zzauJ + ", photoUrl=" + zzauK + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzq.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.ParcelableCollaborator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */