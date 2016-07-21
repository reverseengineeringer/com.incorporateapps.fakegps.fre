package com.google.android.gms.dynamic;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public final class zzb
  extends zzc.zza
{
  private Fragment zzavH;
  
  private zzb(Fragment paramFragment)
  {
    zzavH = paramFragment;
  }
  
  public static zzb zza(Fragment paramFragment)
  {
    if (paramFragment != null) {
      return new zzb(paramFragment);
    }
    return null;
  }
  
  public final Bundle getArguments()
  {
    return zzavH.getArguments();
  }
  
  public final int getId()
  {
    return zzavH.getId();
  }
  
  public final boolean getRetainInstance()
  {
    return zzavH.getRetainInstance();
  }
  
  public final String getTag()
  {
    return zzavH.getTag();
  }
  
  public final int getTargetRequestCode()
  {
    return zzavH.getTargetRequestCode();
  }
  
  public final boolean getUserVisibleHint()
  {
    return zzavH.getUserVisibleHint();
  }
  
  public final zzd getView()
  {
    return zze.zzC(zzavH.getView());
  }
  
  public final boolean isAdded()
  {
    return zzavH.isAdded();
  }
  
  public final boolean isDetached()
  {
    return zzavH.isDetached();
  }
  
  public final boolean isHidden()
  {
    return zzavH.isHidden();
  }
  
  public final boolean isInLayout()
  {
    return zzavH.isInLayout();
  }
  
  public final boolean isRemoving()
  {
    return zzavH.isRemoving();
  }
  
  public final boolean isResumed()
  {
    return zzavH.isResumed();
  }
  
  public final boolean isVisible()
  {
    return zzavH.isVisible();
  }
  
  public final void setHasOptionsMenu(boolean paramBoolean)
  {
    zzavH.setHasOptionsMenu(paramBoolean);
  }
  
  public final void setMenuVisibility(boolean paramBoolean)
  {
    zzavH.setMenuVisibility(paramBoolean);
  }
  
  public final void setRetainInstance(boolean paramBoolean)
  {
    zzavH.setRetainInstance(paramBoolean);
  }
  
  public final void setUserVisibleHint(boolean paramBoolean)
  {
    zzavH.setUserVisibleHint(paramBoolean);
  }
  
  public final void startActivity(Intent paramIntent)
  {
    zzavH.startActivity(paramIntent);
  }
  
  public final void startActivityForResult(Intent paramIntent, int paramInt)
  {
    zzavH.startActivityForResult(paramIntent, paramInt);
  }
  
  public final void zzn(zzd paramzzd)
  {
    paramzzd = (View)zze.zzp(paramzzd);
    zzavH.registerForContextMenu(paramzzd);
  }
  
  public final void zzo(zzd paramzzd)
  {
    paramzzd = (View)zze.zzp(paramzzd);
    zzavH.unregisterForContextMenu(paramzzd);
  }
  
  public final zzd zztV()
  {
    return zze.zzC(zzavH.getActivity());
  }
  
  public final zzc zztW()
  {
    return zza(zzavH.getParentFragment());
  }
  
  public final zzd zztX()
  {
    return zze.zzC(zzavH.getResources());
  }
  
  public final zzc zztY()
  {
    return zza(zzavH.getTargetFragment());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.dynamic.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */