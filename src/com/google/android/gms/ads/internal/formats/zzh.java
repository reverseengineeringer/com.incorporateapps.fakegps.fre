package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import org.json.JSONObject;

public abstract interface zzh
{
  public abstract Context getContext();
  
  public abstract void recordImpression();
  
  public abstract void zza(View paramView, Map paramMap, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3);
  
  public abstract void zza(String paramString, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3);
  
  public abstract void zzb(MotionEvent paramMotionEvent);
  
  public abstract View zzdS();
  
  public abstract void zzh(View paramView);
  
  public abstract void zzi(View paramView);
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */