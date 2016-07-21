package com.google.android.gms.games.appcontent;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public abstract interface AppContentTuple
  extends Parcelable, Freezable
{
  public abstract String getName();
  
  public abstract String getValue();
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentTuple
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */