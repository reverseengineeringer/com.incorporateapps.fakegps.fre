package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class zzf
{
  private Bundle mExtras;
  private Location zzbj;
  private boolean zzpE;
  private long zztS;
  private int zztT;
  private List zztU;
  private boolean zztV;
  private int zztW;
  private String zztX;
  private SearchAdRequestParcel zztY;
  private String zztZ;
  private Bundle zzua;
  private Bundle zzub;
  private List zzuc;
  private String zzud;
  private String zzue;
  private boolean zzuf;
  
  public zzf()
  {
    zztS = -1L;
    mExtras = new Bundle();
    zztT = -1;
    zztU = new ArrayList();
    zztV = false;
    zztW = -1;
    zzpE = false;
    zztX = null;
    zztY = null;
    zzbj = null;
    zztZ = null;
    zzua = new Bundle();
    zzub = new Bundle();
    zzuc = new ArrayList();
    zzud = null;
    zzue = null;
    zzuf = false;
  }
  
  public zzf(AdRequestParcel paramAdRequestParcel)
  {
    zztS = zztC;
    mExtras = extras;
    zztT = zztD;
    zztU = zztE;
    zztV = zztF;
    zztW = zztG;
    zzpE = zztH;
    zztX = zztI;
    zztY = zztJ;
    zzbj = zztK;
    zztZ = zztL;
    zzua = zztM;
    zzub = zztN;
    zzuc = zztO;
    zzud = zztP;
    zzue = zztQ;
  }
  
  public final zzf zza(Location paramLocation)
  {
    zzbj = paramLocation;
    return this;
  }
  
  public final AdRequestParcel zzcN()
  {
    return new AdRequestParcel(7, zztS, mExtras, zztT, zztU, zztV, zztW, zzpE, zztX, zztY, zzbj, zztZ, zzua, zzub, zzuc, zzud, zzue, zzuf);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */