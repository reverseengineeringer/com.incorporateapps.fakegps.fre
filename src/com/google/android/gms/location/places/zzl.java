package com.google.android.gms.location.places;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzng;
import com.google.android.gms.location.places.internal.zzi.zza;
import com.google.android.gms.location.places.personalized.zzd;

public class zzl
  extends zzi.zza
{
  private static final String TAG = zzl.class.getSimpleName();
  private final Context mContext;
  private final zzl.zzd zzaPP;
  private final zzl.zza zzaPQ;
  private final zzl.zze zzaPR;
  private final zzl.zzf zzaPS;
  private final zzl.zzc zzaPT;
  
  public zzl(zzl.zza paramzza)
  {
    zzaPP = null;
    zzaPQ = paramzza;
    zzaPR = null;
    zzaPS = null;
    zzaPT = null;
    mContext = null;
  }
  
  public zzl(zzl.zzc paramzzc, Context paramContext)
  {
    zzaPP = null;
    zzaPQ = null;
    zzaPR = null;
    zzaPS = null;
    zzaPT = paramzzc;
    mContext = paramContext.getApplicationContext();
  }
  
  public zzl(zzl.zzd paramzzd, Context paramContext)
  {
    zzaPP = paramzzd;
    zzaPQ = null;
    zzaPR = null;
    zzaPS = null;
    zzaPT = null;
    mContext = paramContext.getApplicationContext();
  }
  
  public zzl(zzl.zzf paramzzf)
  {
    zzaPP = null;
    zzaPQ = null;
    zzaPR = null;
    zzaPS = paramzzf;
    zzaPT = null;
    mContext = null;
  }
  
  public void zzaU(Status paramStatus)
  {
    zzaPS.zza(paramStatus);
  }
  
  public void zzac(DataHolder paramDataHolder)
  {
    if (zzaPP != null) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "placeEstimator cannot be null");
      if (paramDataHolder != null) {
        break;
      }
      if (Log.isLoggable(TAG, 6)) {
        Log.e(TAG, "onPlaceEstimated received null DataHolder: " + zzng.zzso());
      }
      zzaPP.zzw(Status.zzagE);
      return;
    }
    Bundle localBundle = paramDataHolder.zzpZ();
    if (localBundle == null) {}
    for (int i = 100;; i = PlaceLikelihoodBuffer.zzH(localBundle))
    {
      paramDataHolder = new PlaceLikelihoodBuffer(paramDataHolder, i, mContext);
      zzaPP.zza(paramDataHolder);
      return;
    }
  }
  
  public void zzad(DataHolder paramDataHolder)
  {
    if (paramDataHolder == null)
    {
      if (Log.isLoggable(TAG, 6)) {
        Log.e(TAG, "onAutocompletePrediction received null DataHolder: " + zzng.zzso());
      }
      zzaPQ.zzw(Status.zzagE);
      return;
    }
    zzaPQ.zza(new AutocompletePredictionBuffer(paramDataHolder));
  }
  
  public void zzae(DataHolder paramDataHolder)
  {
    if (paramDataHolder == null)
    {
      if (Log.isLoggable(TAG, 6)) {
        Log.e(TAG, "onPlaceUserDataFetched received null DataHolder: " + zzng.zzso());
      }
      zzaPR.zzw(Status.zzagE);
      return;
    }
    zzaPR.zza(new zzd(paramDataHolder));
  }
  
  public void zzaf(DataHolder paramDataHolder)
  {
    paramDataHolder = new PlaceBuffer(paramDataHolder, mContext);
    zzaPT.zza(paramDataHolder);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.zzl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */