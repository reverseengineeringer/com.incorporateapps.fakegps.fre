package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.List;

public class PlaceImpl$zza
{
  private String mName;
  private int mVersionCode = 0;
  private LatLng zzaPc;
  private String zzaPe;
  private Uri zzaPf;
  private String zzaQA;
  private boolean zzaQB;
  private float zzaQC;
  private int zzaQD;
  private long zzaQE;
  private String zzaQG;
  private List zzaQH;
  private Bundle zzaQK;
  private List zzaQL;
  private float zzaQy;
  private LatLngBounds zzaQz;
  private String zzawc;
  private String zzyv;
  
  public zza zza(LatLng paramLatLng)
  {
    zzaPc = paramLatLng;
    return this;
  }
  
  public zza zza(LatLngBounds paramLatLngBounds)
  {
    zzaQz = paramLatLngBounds;
    return this;
  }
  
  public zza zzan(boolean paramBoolean)
  {
    zzaQB = paramBoolean;
    return this;
  }
  
  public zza zzem(String paramString)
  {
    zzyv = paramString;
    return this;
  }
  
  public zza zzen(String paramString)
  {
    mName = paramString;
    return this;
  }
  
  public zza zzeo(String paramString)
  {
    zzawc = paramString;
    return this;
  }
  
  public zza zzep(String paramString)
  {
    zzaPe = paramString;
    return this;
  }
  
  public zza zzf(float paramFloat)
  {
    zzaQy = paramFloat;
    return this;
  }
  
  public zza zzg(float paramFloat)
  {
    zzaQC = paramFloat;
    return this;
  }
  
  public zza zzhX(int paramInt)
  {
    zzaQD = paramInt;
    return this;
  }
  
  public zza zzo(Uri paramUri)
  {
    zzaPf = paramUri;
    return this;
  }
  
  public zza zzx(List paramList)
  {
    zzaQL = paramList;
    return this;
  }
  
  public zza zzy(List paramList)
  {
    zzaQH = paramList;
    return this;
  }
  
  public PlaceImpl zzzx()
  {
    return new PlaceImpl(mVersionCode, zzyv, zzaQL, Collections.emptyList(), zzaQK, mName, zzawc, zzaPe, zzaQG, zzaQH, zzaPc, zzaQy, zzaQz, zzaQA, zzaPf, zzaQB, zzaQC, zzaQD, zzaQE, PlaceLocalization.zza(mName, zzawc, zzaPe, zzaQG, zzaQH));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.internal.PlaceImpl.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */