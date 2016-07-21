package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.Locale;

public class PlacesParams
  implements SafeParcelable
{
  public static final zzs CREATOR = new zzs();
  public static final PlacesParams zzaQW = new PlacesParams("com.google.android.gms", Locale.getDefault(), null);
  public final int versionCode;
  public final String zzaPU;
  public final String zzaQX;
  public final String zzaQY;
  public final String zzaQZ;
  public final int zzaRa;
  public final int zzaRb;
  
  public PlacesParams(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt2, int paramInt3)
  {
    versionCode = paramInt1;
    zzaQX = paramString1;
    zzaQY = paramString2;
    zzaQZ = paramString3;
    zzaPU = paramString4;
    zzaRa = paramInt2;
    zzaRb = paramInt3;
  }
  
  public PlacesParams(String paramString1, Locale paramLocale, String paramString2)
  {
    this(3, paramString1, paramLocale.toString(), paramString2, null, GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE, 0);
  }
  
  public PlacesParams(String paramString1, Locale paramLocale, String paramString2, String paramString3, int paramInt)
  {
    this(3, paramString1, paramLocale.toString(), paramString2, paramString3, GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE, paramInt);
  }
  
  public int describeContents()
  {
    zzs localzzs = CREATOR;
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (!(paramObject instanceof PlacesParams))) {
        return false;
      }
      paramObject = (PlacesParams)paramObject;
    } while ((zzaRa == zzaRa) && (zzaRb == zzaRb) && (zzaQY.equals(zzaQY)) && (zzaQX.equals(zzaQX)) && (zzw.equal(zzaQZ, zzaQZ)) && (zzw.equal(zzaPU, zzaPU)));
    return false;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzaQX, zzaQY, zzaQZ, zzaPU, Integer.valueOf(zzaRa), Integer.valueOf(zzaRb) });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("clientPackageName", zzaQX).zzg("locale", zzaQY).zzg("accountName", zzaQZ).zzg("gCoreClientName", zzaPU).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzs localzzs = CREATOR;
    zzs.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.internal.PlacesParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */