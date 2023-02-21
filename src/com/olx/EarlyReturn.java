package com.olx;

public class EarlyReturn {
    public static String renderPageWithSetupAndTeardowns_OriginalCode(
            PageData pageData, boolean isSuite
    ) {
        boolean isTestPage = pageData.hasAttribute();
        if (isTestPage) {
            WikiPage testPage = pageData.getWikiPage();
            StringBuffer newPageContent = new StringBuffer();
            includeSetupPages(testPage, newPageContent, isSuite);
            newPageContent.append(pageData.getContent());
            includeTeardownPages(testPage, newPageContent, isSuite);
            pageData.setContent(newPageContent.toString());
        }
        return pageData.getHtml();
    }

    public static String renderPageWithSetupAndTeardowns_EarlyReturn(
            PageData pageData, boolean isSuite
    ) throws Exception {
        boolean isTestPage = pageData.hasAttribute();
        // Early return
        if (!isTestPage) {
            return pageData.getHtml();
        }
        WikiPage testPage = pageData.getWikiPage();
        StringBuffer newPageContent = new StringBuffer();
        includeSetupPages(testPage, newPageContent, isSuite);
        newPageContent.append(pageData.getContent());
        includeTeardownPages(testPage, newPageContent, isSuite);
        pageData.setContent(newPageContent.toString());
        return pageData.toString();
    }

    public static String renderPageWithSetupAndTeardowns_RefactoredCode(
            PageData pageData, boolean isSuite
    ) throws Exception {
        if (!pageData.hasAttribute()) {
            return pageData.getHtml();
        }
        return includeSetupAndTeardownPages(pageData, isSuite);
    }

    static String includeSetupAndTeardownPages(PageData pageData, boolean isSuite) {
        return null;
    }

    static class PageData {
        boolean hasAttribute() {
            return false;
        }

        WikiPage getWikiPage() {
            return null;
        }

        String getContent() {
            return null;
        }

        void setContent(String content) {
        }

        String getHtml() {return null;}
    }

    static class WikiPage {

    }

    static void includeSetupPages(WikiPage testPage, StringBuffer newPageContent, boolean isSuite) {
    }

    static void includeTeardownPages(WikiPage testPage, StringBuffer newPageContent, boolean isSuite) {
    }

}
