/*
Task description: https://www.codewars.com/kata/5268956c10342831a8000135
A Node has the following properties:
var data; // A number or string.
Node left; // Undefined if there is no left child.
Node right; // Undefined if there is no right child.
*/

// 1.) Root node, 2.) traverse left subtree, 3.) traverse right subtree.
function preOrder(node)
{
  var result = [];
  if(node == undefined) return result;
  
  function recursive(node) {
    result.push(node.data);
    if(node.left != undefined) recursive(node.left);
    if(node.right != undefined) recursive(node.right);
    return result;
    }
    return recursive(node);
}

// 1.) Traverse left subtree, 2.) root node, 3.) traverse right subtree.
function inOrder(node)
{
  var result = [];
  if(node == undefined) return result;
  
  function recursive(node) {
    if(node.left != undefined) recursive(node.left);
    result.push(node.data);
    if(node.right != undefined) recursive(node.right);
    return result;
    }
    return recursive(node);
}

// 1.) Traverse left subtree, 2.) traverse right subtree, 3.) root node.
function postOrder(node)
{
  var result = [];
  if(node == undefined) return result;
  
  function recursive(node) {
    if(node.left != undefined) recursive(node.left);
    if(node.right != undefined) recursive(node.right);
    result.push(node.data);
    return result;
    }
    return recursive(node);
}