/*
 * Copyright (c) 2000-2004 by JetBrains s.r.o. All Rights Reserved.
 * Use is subject to license terms.
 */
package com.intellij.psi;

import org.jetbrains.annotations.Nullable;

/**
 * @author ven
 */
public interface PsiAnnotation extends PsiAnnotationMemberValue {
  PsiAnnotation[] EMPTY_ARRAY = new PsiAnnotation[0];

  String DEFAULT_REFERENCED_METHOD_NAME = "value";

  PsiAnnotationParameterList getParameterList();

  @Nullable (documentation = "May return null if unresolved")
  String getQualifiedName();

  PsiJavaCodeReferenceElement getNameReferenceElement ();

  PsiAnnotationMemberValue findAttributeValue(String attributeName);
}
