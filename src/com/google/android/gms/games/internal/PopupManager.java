package com.google.android.gms.games.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.internal.zzne;

public class PopupManager
{
  protected GamesClientImpl zzaFJ;
  protected PopupManager.PopupLocationInfo zzaFK;
  
  private PopupManager(GamesClientImpl paramGamesClientImpl, int paramInt)
  {
    zzaFJ = paramGamesClientImpl;
    zzgv(paramInt);
  }
  
  public static PopupManager zza(GamesClientImpl paramGamesClientImpl, int paramInt)
  {
    if (zzne.zzse()) {
      return new PopupManager.PopupManagerHCMR1(paramGamesClientImpl, paramInt);
    }
    return new PopupManager(paramGamesClientImpl, paramInt);
  }
  
  public void setGravity(int paramInt)
  {
    zzaFK.gravity = paramInt;
  }
  
  protected void zzgv(int paramInt)
  {
    zzaFK = new PopupManager.PopupLocationInfo(paramInt, new Binder(), null);
  }
  
  public void zzp(View paramView) {}
  
  public void zzxh()
  {
    zzaFJ.zza(zzaFK.zzaFL, zzaFK.zzxg());
  }
  
  public Bundle zzxi()
  {
    return zzaFK.zzxg();
  }
  
  public IBinder zzxj()
  {
    return zzaFK.zzaFL;
  }
  
  public PopupManager.PopupLocationInfo zzxk()
  {
    return zzaFK;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.PopupManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */