package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.internal.zzab;
import com.google.android.gms.drive.internal.zzat;
import com.google.android.gms.drive.internal.zzau;
import com.google.android.gms.drive.internal.zzw;
import com.google.android.gms.drive.internal.zzy;
import com.google.android.gms.drive.internal.zzz;
import com.google.android.gms.internal.zzst;
import com.google.android.gms.internal.zzsu;

public class DriveId
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zze();
  public static final int RESOURCE_TYPE_FILE = 0;
  public static final int RESOURCE_TYPE_FOLDER = 1;
  public static final int RESOURCE_TYPE_UNKNOWN = -1;
  final int mVersionCode;
  final String zzaoL;
  final long zzaoM;
  final int zzaoN;
  private volatile String zzaoO = null;
  final long zzaou;
  private volatile String zzaow = null;
  
  DriveId(int paramInt1, String paramString, long paramLong1, long paramLong2, int paramInt2)
  {
    mVersionCode = paramInt1;
    zzaoL = paramString;
    if (!"".equals(paramString)) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      zzx.zzac(bool1);
      if (paramString == null)
      {
        bool1 = bool2;
        if (paramLong1 == -1L) {}
      }
      else
      {
        bool1 = true;
      }
      zzx.zzac(bool1);
      zzaoM = paramLong1;
      zzaou = paramLong2;
      zzaoN = paramInt2;
      return;
    }
  }
  
  public DriveId(String paramString, long paramLong1, long paramLong2, int paramInt)
  {
    this(1, paramString, paramLong1, paramLong2, paramInt);
  }
  
  public static DriveId decodeFromString(String paramString)
  {
    zzx.zzb(paramString.startsWith("DriveId:"), "Invalid DriveId: " + paramString);
    return zzl(Base64.decode(paramString.substring(8), 10));
  }
  
  public static DriveId zzcW(String paramString)
  {
    zzx.zzz(paramString);
    return new DriveId(paramString, -1L, -1L, -1);
  }
  
  static DriveId zzl(byte[] paramArrayOfByte)
  {
    for (;;)
    {
      zzat localzzat;
      try
      {
        localzzat = zzat.zzm(paramArrayOfByte);
        if ("".equals(zzarY))
        {
          paramArrayOfByte = null;
          return new DriveId(versionCode, paramArrayOfByte, zzarZ, zzarW, zzasa);
        }
      }
      catch (zzst paramArrayOfByte)
      {
        throw new IllegalArgumentException();
      }
      paramArrayOfByte = zzarY;
    }
  }
  
  private byte[] zzsA()
  {
    zzau localzzau = new zzau();
    zzarZ = zzaoM;
    zzarW = zzaou;
    return zzsu.toByteArray(localzzau);
  }
  
  public DriveFile asDriveFile()
  {
    if (zzaoN == 1) {
      throw new IllegalStateException("This DriveId corresponds to a folder. Call asDriveFolder instead.");
    }
    return new zzw(this);
  }
  
  public DriveFolder asDriveFolder()
  {
    if (zzaoN == 0) {
      throw new IllegalStateException("This DriveId corresponds to a file. Call asDriveFile instead.");
    }
    return new zzy(this);
  }
  
  public DriveResource asDriveResource()
  {
    if (zzaoN == 1) {
      return asDriveFolder();
    }
    if (zzaoN == 0) {
      return asDriveFile();
    }
    return new zzab(this);
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
      zzaow = ("DriveId:" + str);
    }
    return zzaow;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof DriveId)) {}
    do
    {
      do
      {
        do
        {
          return false;
          paramObject = (DriveId)paramObject;
        } while (zzaou != zzaou);
        if ((zzaoM == -1L) && (zzaoM == -1L)) {
          return zzaoL.equals(zzaoL);
        }
        if ((zzaoL != null) && (zzaoL != null)) {
          break;
        }
      } while (zzaoM != zzaoM);
      return true;
    } while (zzaoM != zzaoM);
    if (zzaoL.equals(zzaoL)) {
      return true;
    }
    zzz.zzz("DriveId", "Unexpected unequal resourceId for same DriveId object.");
    return false;
  }
  
  public String getResourceId()
  {
    return zzaoL;
  }
  
  public int getResourceType()
  {
    return zzaoN;
  }
  
  public int hashCode()
  {
    if (zzaoM == -1L) {
      return zzaoL.hashCode();
    }
    return (String.valueOf(zzaou) + String.valueOf(zzaoM)).hashCode();
  }
  
  public final String toInvariantString()
  {
    if (zzaoO == null) {
      zzaoO = Base64.encodeToString(zzsA(), 10);
    }
    return zzaoO;
  }
  
  public String toString()
  {
    return encodeToString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
  
  final byte[] zzsu()
  {
    zzat localzzat = new zzat();
    versionCode = mVersionCode;
    if (zzaoL == null) {}
    for (String str = "";; str = zzaoL)
    {
      zzarY = str;
      zzarZ = zzaoM;
      zzarW = zzaou;
      zzasa = zzaoN;
      return zzsu.toByteArray(localzzat);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.DriveId
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */