package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public final class StreetViewPanoramaOptions
  implements SafeParcelable
{
  public static final zzb CREATOR = new zzb();
  private final int mVersionCode;
  private Boolean zzaRQ;
  private Boolean zzaRW = Boolean.valueOf(true);
  private StreetViewPanoramaCamera zzaSD;
  private String zzaSE;
  private LatLng zzaSF;
  private Integer zzaSG;
  private Boolean zzaSH = Boolean.valueOf(true);
  private Boolean zzaSI = Boolean.valueOf(true);
  private Boolean zzaSJ = Boolean.valueOf(true);
  
  public StreetViewPanoramaOptions()
  {
    mVersionCode = 1;
  }
  
  StreetViewPanoramaOptions(int paramInt, StreetViewPanoramaCamera paramStreetViewPanoramaCamera, String paramString, LatLng paramLatLng, Integer paramInteger, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5)
  {
    mVersionCode = paramInt;
    zzaSD = paramStreetViewPanoramaCamera;
    zzaSF = paramLatLng;
    zzaSG = paramInteger;
    zzaSE = paramString;
    zzaSH = zza.zza(paramByte1);
    zzaRW = zza.zza(paramByte2);
    zzaSI = zza.zza(paramByte3);
    zzaSJ = zza.zza(paramByte4);
    zzaRQ = zza.zza(paramByte5);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final Boolean getPanningGesturesEnabled()
  {
    return zzaSI;
  }
  
  public final String getPanoramaId()
  {
    return zzaSE;
  }
  
  public final LatLng getPosition()
  {
    return zzaSF;
  }
  
  public final Integer getRadius()
  {
    return zzaSG;
  }
  
  public final Boolean getStreetNamesEnabled()
  {
    return zzaSJ;
  }
  
  public final StreetViewPanoramaCamera getStreetViewPanoramaCamera()
  {
    return zzaSD;
  }
  
  public final Boolean getUseViewLifecycleInFragment()
  {
    return zzaRQ;
  }
  
  public final Boolean getUserNavigationEnabled()
  {
    return zzaSH;
  }
  
  final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final Boolean getZoomGesturesEnabled()
  {
    return zzaRW;
  }
  
  public final StreetViewPanoramaOptions panningGesturesEnabled(boolean paramBoolean)
  {
    zzaSI = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final StreetViewPanoramaOptions panoramaCamera(StreetViewPanoramaCamera paramStreetViewPanoramaCamera)
  {
    zzaSD = paramStreetViewPanoramaCamera;
    return this;
  }
  
  public final StreetViewPanoramaOptions panoramaId(String paramString)
  {
    zzaSE = paramString;
    return this;
  }
  
  public final StreetViewPanoramaOptions position(LatLng paramLatLng)
  {
    zzaSF = paramLatLng;
    return this;
  }
  
  public final StreetViewPanoramaOptions position(LatLng paramLatLng, Integer paramInteger)
  {
    zzaSF = paramLatLng;
    zzaSG = paramInteger;
    return this;
  }
  
  public final StreetViewPanoramaOptions streetNamesEnabled(boolean paramBoolean)
  {
    zzaSJ = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final StreetViewPanoramaOptions useViewLifecycleInFragment(boolean paramBoolean)
  {
    zzaRQ = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final StreetViewPanoramaOptions userNavigationEnabled(boolean paramBoolean)
  {
    zzaSH = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public final StreetViewPanoramaOptions zoomGesturesEnabled(boolean paramBoolean)
  {
    zzaRW = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  final byte zzAa()
  {
    return zza.zze(zzaSH);
  }
  
  final byte zzAb()
  {
    return zza.zze(zzaSI);
  }
  
  final byte zzAc()
  {
    return zza.zze(zzaSJ);
  }
  
  final byte zzzL()
  {
    return zza.zze(zzaRQ);
  }
  
  final byte zzzP()
  {
    return zza.zze(zzaRW);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.StreetViewPanoramaOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */