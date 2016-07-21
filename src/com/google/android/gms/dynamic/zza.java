package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzg;
import java.util.LinkedList;

public abstract class zza
{
  private final zzf zzavA = new zza.1(this);
  private LifecycleDelegate zzavx;
  private Bundle zzavy;
  private LinkedList zzavz;
  
  private void zza(Bundle paramBundle, zza.zza paramzza)
  {
    if (zzavx != null)
    {
      paramzza.zzb(zzavx);
      return;
    }
    if (zzavz == null) {
      zzavz = new LinkedList();
    }
    zzavz.add(paramzza);
    if (paramBundle != null)
    {
      if (zzavy != null) {
        break label76;
      }
      zzavy = ((Bundle)paramBundle.clone());
    }
    for (;;)
    {
      zza(zzavA);
      return;
      label76:
      zzavy.putAll(paramBundle);
    }
  }
  
  public static void zzb(FrameLayout paramFrameLayout)
  {
    Context localContext = paramFrameLayout.getContext();
    int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(localContext);
    String str2 = zzg.zzc(localContext, i, GooglePlayServicesUtil.zzao(localContext));
    String str1 = zzg.zzh(localContext, i);
    LinearLayout localLinearLayout = new LinearLayout(paramFrameLayout.getContext());
    localLinearLayout.setOrientation(1);
    localLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    paramFrameLayout.addView(localLinearLayout);
    paramFrameLayout = new TextView(paramFrameLayout.getContext());
    paramFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    paramFrameLayout.setText(str2);
    localLinearLayout.addView(paramFrameLayout);
    if (str1 != null)
    {
      paramFrameLayout = new Button(localContext);
      paramFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
      paramFrameLayout.setText(str1);
      localLinearLayout.addView(paramFrameLayout);
      paramFrameLayout.setOnClickListener(new zza.5(localContext, i));
    }
  }
  
  private void zzeJ(int paramInt)
  {
    while ((!zzavz.isEmpty()) && (((zza.zza)zzavz.getLast()).getState() >= paramInt)) {
      zzavz.removeLast();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    zza(paramBundle, new zza.3(this, paramBundle));
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    FrameLayout localFrameLayout = new FrameLayout(paramLayoutInflater.getContext());
    zza(paramBundle, new zza.4(this, localFrameLayout, paramLayoutInflater, paramViewGroup, paramBundle));
    if (zzavx == null) {
      zza(localFrameLayout);
    }
    return localFrameLayout;
  }
  
  public void onDestroy()
  {
    if (zzavx != null)
    {
      zzavx.onDestroy();
      return;
    }
    zzeJ(1);
  }
  
  public void onDestroyView()
  {
    if (zzavx != null)
    {
      zzavx.onDestroyView();
      return;
    }
    zzeJ(2);
  }
  
  public void onInflate(Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2)
  {
    zza(paramBundle2, new zza.2(this, paramActivity, paramBundle1, paramBundle2));
  }
  
  public void onLowMemory()
  {
    if (zzavx != null) {
      zzavx.onLowMemory();
    }
  }
  
  public void onPause()
  {
    if (zzavx != null)
    {
      zzavx.onPause();
      return;
    }
    zzeJ(5);
  }
  
  public void onResume()
  {
    zza(null, new zza.7(this));
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    if (zzavx != null) {
      zzavx.onSaveInstanceState(paramBundle);
    }
    while (zzavy == null) {
      return;
    }
    paramBundle.putAll(zzavy);
  }
  
  public void onStart()
  {
    zza(null, new zza.6(this));
  }
  
  public void onStop()
  {
    if (zzavx != null)
    {
      zzavx.onStop();
      return;
    }
    zzeJ(4);
  }
  
  protected void zza(FrameLayout paramFrameLayout)
  {
    zzb(paramFrameLayout);
  }
  
  protected abstract void zza(zzf paramzzf);
  
  public LifecycleDelegate zztU()
  {
    return zzavx;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.dynamic.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */