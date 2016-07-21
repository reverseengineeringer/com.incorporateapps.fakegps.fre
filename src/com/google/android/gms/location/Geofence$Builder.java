package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.location.internal.ParcelableGeofence;

public final class Geofence$Builder
{
  private String zzEY = null;
  private int zzaNC = 0;
  private long zzaND = Long.MIN_VALUE;
  private short zzaNE = -1;
  private double zzaNF;
  private double zzaNG;
  private float zzaNH;
  private int zzaNI = 0;
  private int zzaNJ = -1;
  
  public final Geofence build()
  {
    if (zzEY == null) {
      throw new IllegalArgumentException("Request ID not set.");
    }
    if (zzaNC == 0) {
      throw new IllegalArgumentException("Transitions types not set.");
    }
    if (((zzaNC & 0x4) != 0) && (zzaNJ < 0)) {
      throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
    }
    if (zzaND == Long.MIN_VALUE) {
      throw new IllegalArgumentException("Expiration not set.");
    }
    if (zzaNE == -1) {
      throw new IllegalArgumentException("Geofence region not set.");
    }
    if (zzaNI < 0) {
      throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
    }
    return new ParcelableGeofence(zzEY, zzaNC, (short)1, zzaNF, zzaNG, zzaNH, zzaND, zzaNI, zzaNJ);
  }
  
  public final Builder setCircularRegion(double paramDouble1, double paramDouble2, float paramFloat)
  {
    zzaNE = 1;
    zzaNF = paramDouble1;
    zzaNG = paramDouble2;
    zzaNH = paramFloat;
    return this;
  }
  
  public final Builder setExpirationDuration(long paramLong)
  {
    if (paramLong < 0L)
    {
      zzaND = -1L;
      return this;
    }
    zzaND = (SystemClock.elapsedRealtime() + paramLong);
    return this;
  }
  
  public final Builder setLoiteringDelay(int paramInt)
  {
    zzaNJ = paramInt;
    return this;
  }
  
  public final Builder setNotificationResponsiveness(int paramInt)
  {
    zzaNI = paramInt;
    return this;
  }
  
  public final Builder setRequestId(String paramString)
  {
    zzEY = paramString;
    return this;
  }
  
  public final Builder setTransitionTypes(int paramInt)
  {
    zzaNC = paramInt;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.Geofence.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */