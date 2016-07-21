package com.google.android.gms.location.places;

import android.text.style.CharacterStyle;
import com.google.android.gms.common.data.Freezable;
import java.util.List;

public abstract interface AutocompletePrediction
  extends Freezable
{
  public abstract String getDescription();
  
  public abstract CharSequence getFullText(CharacterStyle paramCharacterStyle);
  
  public abstract List getMatchedSubstrings();
  
  public abstract String getPlaceId();
  
  public abstract List getPlaceTypes();
  
  public abstract CharSequence getPrimaryText(CharacterStyle paramCharacterStyle);
  
  public abstract CharSequence getSecondaryText(CharacterStyle paramCharacterStyle);
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.AutocompletePrediction
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */