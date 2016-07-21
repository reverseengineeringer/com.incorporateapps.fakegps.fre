package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

public final class zzfd
  implements MediationAdRequest
{
  private final int zzCH;
  private final Date zzbf;
  private final Set zzbh;
  private final boolean zzbi;
  private final Location zzbj;
  private final int zztT;
  private final boolean zzuf;
  
  public zzfd(Date paramDate, int paramInt1, Set paramSet, Location paramLocation, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    zzbf = paramDate;
    zztT = paramInt1;
    zzbh = paramSet;
    zzbj = paramLocation;
    zzbi = paramBoolean1;
    zzCH = paramInt2;
    zzuf = paramBoolean2;
  }
  
  public final Date getBirthday()
  {
    return zzbf;
  }
  
  public final int getGender()
  {
    return zztT;
  }
  
  public final Set getKeywords()
  {
    return zzbh;
  }
  
  public final Location getLocation()
  {
    return zzbj;
  }
  
  public final boolean isDesignedForFamilies()
  {
    return zzuf;
  }
  
  public final boolean isTesting()
  {
    return zzbi;
  }
  
  public final int taggedForChildDirectedTreatment()
  {
    return zzCH;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */