package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.internal.zzi;
import com.google.android.gms.maps.model.internal.zzi.zza;

public final class TileOverlayOptions
  implements SafeParcelable
{
  public static final zzo CREATOR = new zzo();
  private final int mVersionCode;
  private zzi zzaTP;
  private TileProvider zzaTQ;
  private boolean zzaTR = true;
  private float zzaTh;
  private boolean zzaTi = true;
  
  public TileOverlayOptions()
  {
    mVersionCode = 1;
  }
  
  TileOverlayOptions(int paramInt, IBinder paramIBinder, boolean paramBoolean1, float paramFloat, boolean paramBoolean2)
  {
    mVersionCode = paramInt;
    zzaTP = zzi.zza.zzdm(paramIBinder);
    if (zzaTP == null) {}
    for (paramIBinder = null;; paramIBinder = new TileOverlayOptions.1(this))
    {
      zzaTQ = paramIBinder;
      zzaTi = paramBoolean1;
      zzaTh = paramFloat;
      zzaTR = paramBoolean2;
      return;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final TileOverlayOptions fadeIn(boolean paramBoolean)
  {
    zzaTR = paramBoolean;
    return this;
  }
  
  public final boolean getFadeIn()
  {
    return zzaTR;
  }
  
  public final TileProvider getTileProvider()
  {
    return zzaTQ;
  }
  
  final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final float getZIndex()
  {
    return zzaTh;
  }
  
  public final boolean isVisible()
  {
    return zzaTi;
  }
  
  public final TileOverlayOptions tileProvider(TileProvider paramTileProvider)
  {
    zzaTQ = paramTileProvider;
    if (zzaTQ == null) {}
    for (paramTileProvider = null;; paramTileProvider = new TileOverlayOptions.2(this, paramTileProvider))
    {
      zzaTP = paramTileProvider;
      return this;
    }
  }
  
  public final TileOverlayOptions visible(boolean paramBoolean)
  {
    zzaTi = paramBoolean;
    return this;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzo.zza(this, paramParcel, paramInt);
  }
  
  public final TileOverlayOptions zIndex(float paramFloat)
  {
    zzaTh = paramFloat;
    return this;
  }
  
  final IBinder zzAm()
  {
    return zzaTP.asBinder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.TileOverlayOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */