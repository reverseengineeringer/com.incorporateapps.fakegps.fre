package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import java.util.List;

public abstract interface AppContentAction
  extends Parcelable, Freezable
{
  public abstract Bundle getExtras();
  
  public abstract String getId();
  
  public abstract String getType();
  
  public abstract AppContentAnnotation zzvO();
  
  public abstract List zzvP();
  
  public abstract String zzvQ();
  
  public abstract String zzvR();
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentAction
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */