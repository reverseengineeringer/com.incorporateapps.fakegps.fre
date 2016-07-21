package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

public final class GroundOverlayOptions
  implements SafeParcelable
{
  public static final zzc CREATOR = new zzc();
  public static final float NO_DIMENSION = -1.0F;
  private final int mVersionCode;
  private LatLngBounds zzaRk;
  private float zzaTa;
  private float zzaTh;
  private boolean zzaTi = true;
  private BitmapDescriptor zzaTk;
  private LatLng zzaTl;
  private float zzaTm;
  private float zzaTn;
  private float zzaTo = 0.0F;
  private float zzaTp = 0.5F;
  private float zzaTq = 0.5F;
  private boolean zzaTr = false;
  
  public GroundOverlayOptions()
  {
    mVersionCode = 1;
  }
  
  GroundOverlayOptions(int paramInt, IBinder paramIBinder, LatLng paramLatLng, float paramFloat1, float paramFloat2, LatLngBounds paramLatLngBounds, float paramFloat3, float paramFloat4, boolean paramBoolean1, float paramFloat5, float paramFloat6, float paramFloat7, boolean paramBoolean2)
  {
    mVersionCode = paramInt;
    zzaTk = new BitmapDescriptor(zzd.zza.zzbs(paramIBinder));
    zzaTl = paramLatLng;
    zzaTm = paramFloat1;
    zzaTn = paramFloat2;
    zzaRk = paramLatLngBounds;
    zzaTa = paramFloat3;
    zzaTh = paramFloat4;
    zzaTi = paramBoolean1;
    zzaTo = paramFloat5;
    zzaTp = paramFloat6;
    zzaTq = paramFloat7;
    zzaTr = paramBoolean2;
  }
  
  private GroundOverlayOptions zza(LatLng paramLatLng, float paramFloat1, float paramFloat2)
  {
    zzaTl = paramLatLng;
    zzaTm = paramFloat1;
    zzaTn = paramFloat2;
    return this;
  }
  
  public final GroundOverlayOptions anchor(float paramFloat1, float paramFloat2)
  {
    zzaTp = paramFloat1;
    zzaTq = paramFloat2;
    return this;
  }
  
  public final GroundOverlayOptions bearing(float paramFloat)
  {
    zzaTa = ((paramFloat % 360.0F + 360.0F) % 360.0F);
    return this;
  }
  
  public final GroundOverlayOptions clickable(boolean paramBoolean)
  {
    zzaTr = paramBoolean;
    return this;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final float getAnchorU()
  {
    return zzaTp;
  }
  
  public final float getAnchorV()
  {
    return zzaTq;
  }
  
  public final float getBearing()
  {
    return zzaTa;
  }
  
  public final LatLngBounds getBounds()
  {
    return zzaRk;
  }
  
  public final float getHeight()
  {
    return zzaTn;
  }
  
  public final BitmapDescriptor getImage()
  {
    return zzaTk;
  }
  
  public final LatLng getLocation()
  {
    return zzaTl;
  }
  
  public final float getTransparency()
  {
    return zzaTo;
  }
  
  final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final float getWidth()
  {
    return zzaTm;
  }
  
  public final float getZIndex()
  {
    return zzaTh;
  }
  
  public final GroundOverlayOptions image(BitmapDescriptor paramBitmapDescriptor)
  {
    zzaTk = paramBitmapDescriptor;
    return this;
  }
  
  public final boolean isClickable()
  {
    return zzaTr;
  }
  
  public final boolean isVisible()
  {
    return zzaTi;
  }
  
  public final GroundOverlayOptions position(LatLng paramLatLng, float paramFloat)
  {
    boolean bool2 = true;
    if (zzaRk == null)
    {
      bool1 = true;
      zzx.zza(bool1, "Position has already been set using positionFromBounds");
      if (paramLatLng == null) {
        break label59;
      }
      bool1 = true;
      label24:
      zzx.zzb(bool1, "Location must be specified");
      if (paramFloat < 0.0F) {
        break label64;
      }
    }
    label59:
    label64:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zzb(bool1, "Width must be non-negative");
      return zza(paramLatLng, paramFloat, -1.0F);
      bool1 = false;
      break;
      bool1 = false;
      break label24;
    }
  }
  
  public final GroundOverlayOptions position(LatLng paramLatLng, float paramFloat1, float paramFloat2)
  {
    boolean bool2 = true;
    if (zzaRk == null)
    {
      bool1 = true;
      zzx.zza(bool1, "Position has already been set using positionFromBounds");
      if (paramLatLng == null) {
        break label81;
      }
      bool1 = true;
      label27:
      zzx.zzb(bool1, "Location must be specified");
      if (paramFloat1 < 0.0F) {
        break label87;
      }
      bool1 = true;
      label43:
      zzx.zzb(bool1, "Width must be non-negative");
      if (paramFloat2 < 0.0F) {
        break label93;
      }
    }
    label81:
    label87:
    label93:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zzb(bool1, "Height must be non-negative");
      return zza(paramLatLng, paramFloat1, paramFloat2);
      bool1 = false;
      break;
      bool1 = false;
      break label27;
      bool1 = false;
      break label43;
    }
  }
  
  public final GroundOverlayOptions positionFromBounds(LatLngBounds paramLatLngBounds)
  {
    if (zzaTl == null) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Position has already been set using position: " + zzaTl);
      zzaRk = paramLatLngBounds;
      return this;
    }
  }
  
  public final GroundOverlayOptions transparency(float paramFloat)
  {
    if ((paramFloat >= 0.0F) && (paramFloat <= 1.0F)) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Transparency must be in the range [0..1]");
      zzaTo = paramFloat;
      return this;
    }
  }
  
  public final GroundOverlayOptions visible(boolean paramBoolean)
  {
    zzaTi = paramBoolean;
    return this;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public final GroundOverlayOptions zIndex(float paramFloat)
  {
    zzaTh = paramFloat;
    return this;
  }
  
  final IBinder zzAj()
  {
    return zzaTk.zzzH().asBinder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.GroundOverlayOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */