package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import java.util.List;

public abstract interface AppContentSection
  extends Parcelable, Freezable
{
  public abstract List getActions();
  
  public abstract Bundle getExtras();
  
  public abstract String getId();
  
  public abstract String getTitle();
  
  public abstract String getType();
  
  public abstract String zzvQ();
  
  public abstract List zzwa();
  
  public abstract String zzwc();
  
  public abstract List zzwk();
  
  public abstract String zzwl();
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentSection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */