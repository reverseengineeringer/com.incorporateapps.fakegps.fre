package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.internal.zzas;
import com.google.android.gms.internal.zzsu;

public class ChangeSequenceNumber
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  final int mVersionCode;
  final long zzaot;
  final long zzaou;
  final long zzaov;
  private volatile String zzaow = null;
  
  ChangeSequenceNumber(int paramInt, long paramLong1, long paramLong2, long paramLong3)
  {
    if (paramLong1 != -1L)
    {
      bool1 = true;
      zzx.zzac(bool1);
      if (paramLong2 == -1L) {
        break label92;
      }
      bool1 = true;
      label40:
      zzx.zzac(bool1);
      if (paramLong3 == -1L) {
        break label98;
      }
    }
    label92:
    label98:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zzac(bool1);
      mVersionCode = paramInt;
      zzaot = paramLong1;
      zzaou = paramLong2;
      zzaov = paramLong3;
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label40;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final String encodeToString()
  {
    if (zzaow == null)
    {
      String str = Base64.encodeToString(zzsu(), 10);
      zzaow = ("ChangeSequenceNumber:" + str);
    }
    return zzaow;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ChangeSequenceNumber)) {}
    do
    {
      return false;
      paramObject = (ChangeSequenceNumber)paramObject;
    } while ((zzaou != zzaou) || (zzaov != zzaov) || (zzaot != zzaot));
    return true;
  }
  
  public int hashCode()
  {
    return (String.valueOf(zzaot) + String.valueOf(zzaou) + String.valueOf(zzaov)).hashCode();
  }
  
  public String toString()
  {
    return encodeToString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  final byte[] zzsu()
  {
    zzas localzzas = new zzas();
    versionCode = mVersionCode;
    zzarV = zzaot;
    zzarW = zzaou;
    zzarX = zzaov;
    return zzsu.toByteArray(localzzas);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.ChangeSequenceNumber
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */