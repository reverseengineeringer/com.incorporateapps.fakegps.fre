package com.google.android.gms.plus.model.people;

import com.google.android.gms.common.data.Freezable;

public abstract interface Person$Name
  extends Freezable
{
  public abstract String getFamilyName();
  
  public abstract String getFormatted();
  
  public abstract String getGivenName();
  
  public abstract String getHonorificPrefix();
  
  public abstract String getHonorificSuffix();
  
  public abstract String getMiddleName();
  
  public abstract boolean hasFamilyName();
  
  public abstract boolean hasFormatted();
  
  public abstract boolean hasGivenName();
  
  public abstract boolean hasHonorificPrefix();
  
  public abstract boolean hasHonorificSuffix();
  
  public abstract boolean hasMiddleName();
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.model.people.Person.Name
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */