package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

public class ParcelableGeofence
  implements SafeParcelable, Geofence
{
  public static final zzo CREATOR = new zzo();
  private final int mVersionCode;
  private final String zzEY;
  private final int zzaNC;
  private final short zzaNE;
  private final double zzaNF;
  private final double zzaNG;
  private final float zzaNH;
  private final int zzaNI;
  private final int zzaNJ;
  private final long zzaOZ;
  
  public ParcelableGeofence(int paramInt1, String paramString, int paramInt2, short paramShort, double paramDouble1, double paramDouble2, float paramFloat, long paramLong, int paramInt3, int paramInt4)
  {
    zzek(paramString);
    zze(paramFloat);
    zza(paramDouble1, paramDouble2);
    paramInt2 = zzhF(paramInt2);
    mVersionCode = paramInt1;
    zzaNE = paramShort;
    zzEY = paramString;
    zzaNF = paramDouble1;
    zzaNG = paramDouble2;
    zzaNH = paramFloat;
    zzaOZ = paramLong;
    zzaNC = paramInt2;
    zzaNI = paramInt3;
    zzaNJ = paramInt4;
  }
  
  public ParcelableGeofence(String paramString, int paramInt1, short paramShort, double paramDouble1, double paramDouble2, float paramFloat, long paramLong, int paramInt2, int paramInt3)
  {
    this(1, paramString, paramInt1, paramShort, paramDouble1, paramDouble2, paramFloat, paramLong, paramInt2, paramInt3);
  }
  
  private static void zza(double paramDouble1, double paramDouble2)
  {
    if ((paramDouble1 > 90.0D) || (paramDouble1 < -90.0D)) {
      throw new IllegalArgumentException("invalid latitude: " + paramDouble1);
    }
    if ((paramDouble2 > 180.0D) || (paramDouble2 < -180.0D)) {
      throw new IllegalArgumentException("invalid longitude: " + paramDouble2);
    }
  }
  
  private static void zze(float paramFloat)
  {
    if (paramFloat <= 0.0F) {
      throw new IllegalArgumentException("invalid radius: " + paramFloat);
    }
  }
  
  private static void zzek(String paramString)
  {
    if ((paramString == null) || (paramString.length() > 100)) {
      throw new IllegalArgumentException("requestId is null or too long: " + paramString);
    }
  }
  
  private static int zzhF(int paramInt)
  {
    int i = paramInt & 0x7;
    if (i == 0) {
      throw new IllegalArgumentException("No supported transition specified: " + paramInt);
    }
    return i;
  }
  
  private static String zzhG(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    return "CIRCLE";
  }
  
  public static ParcelableGeofence zzo(byte[] paramArrayOfByte)
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.unmarshall(paramArrayOfByte, 0, paramArrayOfByte.length);
    localParcel.setDataPosition(0);
    paramArrayOfByte = CREATOR.zzeZ(localParcel);
    localParcel.recycle();
    return paramArrayOfByte;
  }
  
  public int describeContents()
  {
    zzo localzzo = CREATOR;
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (paramObject == null) {
        return false;
      }
      if (!(paramObject instanceof ParcelableGeofence)) {
        return false;
      }
      paramObject = (ParcelableGeofence)paramObject;
      if (zzaNH != zzaNH) {
        return false;
      }
      if (zzaNF != zzaNF) {
        return false;
      }
      if (zzaNG != zzaNG) {
        return false;
      }
    } while (zzaNE == zzaNE);
    return false;
  }
  
  public long getExpirationTime()
  {
    return zzaOZ;
  }
  
  public double getLatitude()
  {
    return zzaNF;
  }
  
  public double getLongitude()
  {
    return zzaNG;
  }
  
  public int getNotificationResponsiveness()
  {
    return zzaNI;
  }
  
  public String getRequestId()
  {
    return zzEY;
  }
  
  public int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    long l = Double.doubleToLongBits(zzaNF);
    int i = (int)(l ^ l >>> 32);
    l = Double.doubleToLongBits(zzaNG);
    return ((((i + 31) * 31 + (int)(l ^ l >>> 32)) * 31 + Float.floatToIntBits(zzaNH)) * 31 + zzaNE) * 31 + zzaNC;
  }
  
  public String toString()
  {
    return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[] { zzhG(zzaNE), zzEY, Integer.valueOf(zzaNC), Double.valueOf(zzaNF), Double.valueOf(zzaNG), Float.valueOf(zzaNH), Integer.valueOf(zzaNI / 1000), Integer.valueOf(zzaNJ), Long.valueOf(zzaOZ) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzo localzzo = CREATOR;
    zzo.zza(this, paramParcel, paramInt);
  }
  
  public short zzyT()
  {
    return zzaNE;
  }
  
  public float zzyU()
  {
    return zzaNH;
  }
  
  public int zzyV()
  {
    return zzaNC;
  }
  
  public int zzyW()
  {
    return zzaNJ;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.internal.ParcelableGeofence
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */