package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

public final class zzh
  extends zzc.zza
{
  private Fragment zzalg;
  
  private zzh(Fragment paramFragment)
  {
    zzalg = paramFragment;
  }
  
  public static zzh zza(Fragment paramFragment)
  {
    if (paramFragment != null) {
      return new zzh(paramFragment);
    }
    return null;
  }
  
  public final Bundle getArguments()
  {
    return zzalg.getArguments();
  }
  
  public final int getId()
  {
    return zzalg.getId();
  }
  
  public final boolean getRetainInstance()
  {
    return zzalg.getRetainInstance();
  }
  
  public final String getTag()
  {
    return zzalg.getTag();
  }
  
  public final int getTargetRequestCode()
  {
    return zzalg.getTargetRequestCode();
  }
  
  public final boolean getUserVisibleHint()
  {
    return zzalg.getUserVisibleHint();
  }
  
  public final zzd getView()
  {
    return zze.zzC(zzalg.getView());
  }
  
  public final boolean isAdded()
  {
    return zzalg.isAdded();
  }
  
  public final boolean isDetached()
  {
    return zzalg.isDetached();
  }
  
  public final boolean isHidden()
  {
    return zzalg.isHidden();
  }
  
  public final boolean isInLayout()
  {
    return zzalg.isInLayout();
  }
  
  public final boolean isRemoving()
  {
    return zzalg.isRemoving();
  }
  
  public final boolean isResumed()
  {
    return zzalg.isResumed();
  }
  
  public final boolean isVisible()
  {
    return zzalg.isVisible();
  }
  
  public final void setHasOptionsMenu(boolean paramBoolean)
  {
    zzalg.setHasOptionsMenu(paramBoolean);
  }
  
  public final void setMenuVisibility(boolean paramBoolean)
  {
    zzalg.setMenuVisibility(paramBoolean);
  }
  
  public final void setRetainInstance(boolean paramBoolean)
  {
    zzalg.setRetainInstance(paramBoolean);
  }
  
  public final void setUserVisibleHint(boolean paramBoolean)
  {
    zzalg.setUserVisibleHint(paramBoolean);
  }
  
  public final void startActivity(Intent paramIntent)
  {
    zzalg.startActivity(paramIntent);
  }
  
  public final void startActivityForResult(Intent paramIntent, int paramInt)
  {
    zzalg.startActivityForResult(paramIntent, paramInt);
  }
  
  public final void zzn(zzd paramzzd)
  {
    paramzzd = (View)zze.zzp(paramzzd);
    zzalg.registerForContextMenu(paramzzd);
  }
  
  public final void zzo(zzd paramzzd)
  {
    paramzzd = (View)zze.zzp(paramzzd);
    zzalg.unregisterForContextMenu(paramzzd);
  }
  
  public final zzd zztV()
  {
    return zze.zzC(zzalg.getActivity());
  }
  
  public final zzc zztW()
  {
    return zza(zzalg.getParentFragment());
  }
  
  public final zzd zztX()
  {
    return zze.zzC(zzalg.getResources());
  }
  
  public final zzc zztY()
  {
    return zza(zzalg.getTargetFragment());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.dynamic.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */