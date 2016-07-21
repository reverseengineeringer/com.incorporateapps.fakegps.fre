package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public abstract interface MostRecentGameInfo
  extends Parcelable, Freezable
{
  public abstract long zzxA();
  
  public abstract Uri zzxB();
  
  public abstract Uri zzxC();
  
  public abstract Uri zzxD();
  
  public abstract String zzxy();
  
  public abstract String zzxz();
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.player.MostRecentGameInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */