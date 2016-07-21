package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender.SendIntentException;
import android.util.Log;
import com.google.android.gms.common.internal.zzx;

public abstract class ResolvingResultCallbacks
  extends ResultCallbacks
{
  private final Activity mActivity;
  private final int zzagz;
  
  protected ResolvingResultCallbacks(Activity paramActivity, int paramInt)
  {
    mActivity = ((Activity)zzx.zzb(paramActivity, "Activity must not be null"));
    zzagz = paramInt;
  }
  
  public final void onFailure(Status paramStatus)
  {
    if (paramStatus.hasResolution()) {
      try
      {
        paramStatus.startResolutionForResult(mActivity, zzagz);
        return;
      }
      catch (IntentSender.SendIntentException paramStatus)
      {
        Log.e("ResolvingResultCallback", "Failed to start resolution", paramStatus);
        onUnresolvableFailure(new Status(8));
        return;
      }
    }
    onUnresolvableFailure(paramStatus);
  }
  
  public abstract void onSuccess(Result paramResult);
  
  public abstract void onUnresolvableFailure(Status paramStatus);
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.ResolvingResultCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */